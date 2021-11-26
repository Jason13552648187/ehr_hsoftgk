package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmStay;
import cn.ibizlab.ehr.webapi.dto.TrmStayDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:47+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmStayMappingImpl implements TrmStayMapping {

    @Override
    public TrmStay toDomain(TrmStayDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmStay trmStay = new TrmStay();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmStay.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmStay.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getLxr() != null ) {
            trmStay.setLxr( dto.getLxr() );
        }
        if ( dto.getTrmstayname() != null ) {
            trmStay.setTrmstayname( dto.getTrmstayname() );
        }
        if ( dto.getFjlx() != null ) {
            trmStay.setFjlx( dto.getFjlx() );
        }
        if ( dto.getFjsl() != null ) {
            trmStay.setFjsl( dto.getFjsl() );
        }
        if ( dto.getLxdh() != null ) {
            trmStay.setLxdh( dto.getLxdh() );
        }
        if ( dto.getTrmtrainaddressid() != null ) {
            trmStay.setTrmtrainaddressid( dto.getTrmtrainaddressid() );
        }
        if ( dto.getCreateman() != null ) {
            trmStay.setCreateman( dto.getCreateman() );
        }
        if ( dto.getTrmstayid() != null ) {
            trmStay.setTrmstayid( dto.getTrmstayid() );
        }
        if ( dto.getEnable() != null ) {
            trmStay.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            trmStay.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            trmStay.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmStay.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getTrmtrainaddressname() != null ) {
            trmStay.setTrmtrainaddressname( dto.getTrmtrainaddressname() );
        }

        return trmStay;
    }

    @Override
    public TrmStayDTO toDto(TrmStay entity) {
        if ( entity == null ) {
            return null;
        }

        TrmStayDTO trmStayDTO = new TrmStayDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmStayDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmStayDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getLxr() != null ) {
            trmStayDTO.setLxr( entity.getLxr() );
        }
        if ( entity.getTrmstayname() != null ) {
            trmStayDTO.setTrmstayname( entity.getTrmstayname() );
        }
        if ( entity.getFjlx() != null ) {
            trmStayDTO.setFjlx( entity.getFjlx() );
        }
        if ( entity.getFjsl() != null ) {
            trmStayDTO.setFjsl( entity.getFjsl() );
        }
        if ( entity.getLxdh() != null ) {
            trmStayDTO.setLxdh( entity.getLxdh() );
        }
        if ( entity.getTrmtrainaddressid() != null ) {
            trmStayDTO.setTrmtrainaddressid( entity.getTrmtrainaddressid() );
        }
        if ( entity.getCreateman() != null ) {
            trmStayDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getTrmstayid() != null ) {
            trmStayDTO.setTrmstayid( entity.getTrmstayid() );
        }
        if ( entity.getEnable() != null ) {
            trmStayDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            trmStayDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            trmStayDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmStayDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getTrmtrainaddressname() != null ) {
            trmStayDTO.setTrmtrainaddressname( entity.getTrmtrainaddressname() );
        }

        return trmStayDTO;
    }

    @Override
    public List<TrmStay> toDomain(List<TrmStayDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmStay> list = new ArrayList<TrmStay>( dtoList.size() );
        for ( TrmStayDTO trmStayDTO : dtoList ) {
            list.add( toDomain( trmStayDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmStayDTO> toDto(List<TrmStay> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmStayDTO> list = new ArrayList<TrmStayDTO>( entityList.size() );
        for ( TrmStay trmStay : entityList ) {
            list.add( toDto( trmStay ) );
        }

        return list;
    }
}
