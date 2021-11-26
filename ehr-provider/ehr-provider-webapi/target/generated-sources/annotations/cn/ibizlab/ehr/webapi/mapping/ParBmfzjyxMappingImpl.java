package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParBmfzjyx;
import cn.ibizlab.ehr.webapi.dto.ParBmfzjyxDTO;
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
    date = "2021-09-04T00:31:55+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParBmfzjyxMappingImpl implements ParBmfzjyxMapping {

    @Override
    public ParBmfzjyx toDomain(ParBmfzjyxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParBmfzjyx parBmfzjyx = new ParBmfzjyx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parBmfzjyx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parBmfzjyx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getParbmfzjyxname() != null ) {
            parBmfzjyx.setParbmfzjyxname( dto.getParbmfzjyxname() );
        }
        if ( dto.getYgpx() != null ) {
            parBmfzjyx.setYgpx( dto.getYgpx() );
        }
        if ( dto.getBzsm() != null ) {
            parBmfzjyx.setBzsm( dto.getBzsm() );
        }
        if ( dto.getPartzggid() != null ) {
            parBmfzjyx.setPartzggid( dto.getPartzggid() );
        }
        if ( dto.getPimpersonid() != null ) {
            parBmfzjyx.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getUpdateman() != null ) {
            parBmfzjyx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            parBmfzjyx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            parBmfzjyx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            parBmfzjyx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getParbmfzjyxid() != null ) {
            parBmfzjyx.setParbmfzjyxid( dto.getParbmfzjyxid() );
        }
        if ( dto.getPimpersonname() != null ) {
            parBmfzjyx.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getSsbm() != null ) {
            parBmfzjyx.setSsbm( dto.getSsbm() );
        }
        if ( dto.getPartzggname() != null ) {
            parBmfzjyx.setPartzggname( dto.getPartzggname() );
        }
        if ( dto.getSszz() != null ) {
            parBmfzjyx.setSszz( dto.getSszz() );
        }

        return parBmfzjyx;
    }

    @Override
    public ParBmfzjyxDTO toDto(ParBmfzjyx entity) {
        if ( entity == null ) {
            return null;
        }

        ParBmfzjyxDTO parBmfzjyxDTO = new ParBmfzjyxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parBmfzjyxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parBmfzjyxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getParbmfzjyxname() != null ) {
            parBmfzjyxDTO.setParbmfzjyxname( entity.getParbmfzjyxname() );
        }
        if ( entity.getYgpx() != null ) {
            parBmfzjyxDTO.setYgpx( entity.getYgpx() );
        }
        if ( entity.getBzsm() != null ) {
            parBmfzjyxDTO.setBzsm( entity.getBzsm() );
        }
        if ( entity.getPartzggid() != null ) {
            parBmfzjyxDTO.setPartzggid( entity.getPartzggid() );
        }
        if ( entity.getPimpersonid() != null ) {
            parBmfzjyxDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getUpdateman() != null ) {
            parBmfzjyxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            parBmfzjyxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            parBmfzjyxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            parBmfzjyxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getParbmfzjyxid() != null ) {
            parBmfzjyxDTO.setParbmfzjyxid( entity.getParbmfzjyxid() );
        }
        if ( entity.getPimpersonname() != null ) {
            parBmfzjyxDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getSsbm() != null ) {
            parBmfzjyxDTO.setSsbm( entity.getSsbm() );
        }
        if ( entity.getPartzggname() != null ) {
            parBmfzjyxDTO.setPartzggname( entity.getPartzggname() );
        }
        if ( entity.getSszz() != null ) {
            parBmfzjyxDTO.setSszz( entity.getSszz() );
        }

        return parBmfzjyxDTO;
    }

    @Override
    public List<ParBmfzjyx> toDomain(List<ParBmfzjyxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParBmfzjyx> list = new ArrayList<ParBmfzjyx>( dtoList.size() );
        for ( ParBmfzjyxDTO parBmfzjyxDTO : dtoList ) {
            list.add( toDomain( parBmfzjyxDTO ) );
        }

        return list;
    }

    @Override
    public List<ParBmfzjyxDTO> toDto(List<ParBmfzjyx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParBmfzjyxDTO> list = new ArrayList<ParBmfzjyxDTO>( entityList.size() );
        for ( ParBmfzjyx parBmfzjyx : entityList ) {
            list.add( toDto( parBmfzjyx ) );
        }

        return list;
    }
}
