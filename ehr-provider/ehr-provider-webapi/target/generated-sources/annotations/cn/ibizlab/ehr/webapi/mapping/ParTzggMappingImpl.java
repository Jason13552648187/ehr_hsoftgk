package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParTzgg;
import cn.ibizlab.ehr.webapi.dto.ParTzggDTO;
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
    date = "2021-09-04T00:31:51+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParTzggMappingImpl implements ParTzggMapping {

    @Override
    public ParTzgg toDomain(ParTzggDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParTzgg parTzgg = new ParTzgg();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parTzgg.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parTzgg.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getLhzbmb() != null ) {
            parTzgg.setLhzbmb( dto.getLhzbmb() );
        }
        if ( dto.getZqlx() != null ) {
            parTzgg.setZqlx( dto.getZqlx() );
        }
        if ( dto.getNd() != null ) {
            parTzgg.setNd( dto.getNd() );
        }
        if ( dto.getYd() != null ) {
            parTzgg.setYd( dto.getYd() );
        }
        if ( dto.getTzlx() != null ) {
            parTzgg.setTzlx( dto.getTzlx() );
        }
        if ( dto.getPartzggname() != null ) {
            parTzgg.setPartzggname( dto.getPartzggname() );
        }
        if ( dto.getJzsj() != null ) {
            parTzgg.setJzsj( dto.getJzsj() );
        }
        if ( dto.getUpdateman() != null ) {
            parTzgg.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPartzggid() != null ) {
            parTzgg.setPartzggid( dto.getPartzggid() );
        }
        if ( dto.getCreatedate() != null ) {
            parTzgg.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            parTzgg.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            parTzgg.setCreateman( dto.getCreateman() );
        }

        return parTzgg;
    }

    @Override
    public ParTzggDTO toDto(ParTzgg entity) {
        if ( entity == null ) {
            return null;
        }

        ParTzggDTO parTzggDTO = new ParTzggDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parTzggDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parTzggDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getLhzbmb() != null ) {
            parTzggDTO.setLhzbmb( entity.getLhzbmb() );
        }
        if ( entity.getZqlx() != null ) {
            parTzggDTO.setZqlx( entity.getZqlx() );
        }
        if ( entity.getNd() != null ) {
            parTzggDTO.setNd( entity.getNd() );
        }
        if ( entity.getYd() != null ) {
            parTzggDTO.setYd( entity.getYd() );
        }
        if ( entity.getTzlx() != null ) {
            parTzggDTO.setTzlx( entity.getTzlx() );
        }
        if ( entity.getPartzggname() != null ) {
            parTzggDTO.setPartzggname( entity.getPartzggname() );
        }
        if ( entity.getJzsj() != null ) {
            parTzggDTO.setJzsj( entity.getJzsj() );
        }
        if ( entity.getUpdateman() != null ) {
            parTzggDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPartzggid() != null ) {
            parTzggDTO.setPartzggid( entity.getPartzggid() );
        }
        if ( entity.getCreatedate() != null ) {
            parTzggDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            parTzggDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            parTzggDTO.setCreateman( entity.getCreateman() );
        }

        return parTzggDTO;
    }

    @Override
    public List<ParTzgg> toDomain(List<ParTzggDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParTzgg> list = new ArrayList<ParTzgg>( dtoList.size() );
        for ( ParTzggDTO parTzggDTO : dtoList ) {
            list.add( toDomain( parTzggDTO ) );
        }

        return list;
    }

    @Override
    public List<ParTzggDTO> toDto(List<ParTzgg> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParTzggDTO> list = new ArrayList<ParTzggDTO>( entityList.size() );
        for ( ParTzgg parTzgg : entityList ) {
            list.add( toDto( parTzgg ) );
        }

        return list;
    }
}
