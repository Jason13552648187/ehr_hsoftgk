package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParJzszpsjg;
import cn.ibizlab.ehr.webapi.dto.ParJzszpsjgDTO;
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
    date = "2021-09-04T00:31:49+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParJzszpsjgMappingImpl implements ParJzszpsjgMapping {

    @Override
    public ParJzszpsjg toDomain(ParJzszpsjgDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParJzszpsjg parJzszpsjg = new ParJzszpsjg();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parJzszpsjg.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parJzszpsjg.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getParjzszpsjgname() != null ) {
            parJzszpsjg.setParjzszpsjgname( dto.getParjzszpsjgname() );
        }
        if ( dto.getNd() != null ) {
            parJzszpsjg.setNd( dto.getNd() );
        }
        if ( dto.getKhdx() != null ) {
            parJzszpsjg.setKhdx( dto.getKhdx() );
        }
        if ( dto.getSzpsfs() != null ) {
            parJzszpsjg.setSzpsfs( dto.getSzpsfs() );
        }
        if ( dto.getPimpersonid() != null ) {
            parJzszpsjg.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getUpdatedate() != null ) {
            parJzszpsjg.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            parJzszpsjg.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            parJzszpsjg.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            parJzszpsjg.setCreateman( dto.getCreateman() );
        }
        if ( dto.getParjzszpsjgid() != null ) {
            parJzszpsjg.setParjzszpsjgid( dto.getParjzszpsjgid() );
        }
        if ( dto.getPimpersonname() != null ) {
            parJzszpsjg.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getZjhm() != null ) {
            parJzszpsjg.setZjhm( dto.getZjhm() );
        }

        return parJzszpsjg;
    }

    @Override
    public ParJzszpsjgDTO toDto(ParJzszpsjg entity) {
        if ( entity == null ) {
            return null;
        }

        ParJzszpsjgDTO parJzszpsjgDTO = new ParJzszpsjgDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parJzszpsjgDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parJzszpsjgDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getParjzszpsjgname() != null ) {
            parJzszpsjgDTO.setParjzszpsjgname( entity.getParjzszpsjgname() );
        }
        if ( entity.getNd() != null ) {
            parJzszpsjgDTO.setNd( entity.getNd() );
        }
        if ( entity.getKhdx() != null ) {
            parJzszpsjgDTO.setKhdx( entity.getKhdx() );
        }
        if ( entity.getSzpsfs() != null ) {
            parJzszpsjgDTO.setSzpsfs( entity.getSzpsfs() );
        }
        if ( entity.getPimpersonid() != null ) {
            parJzszpsjgDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getUpdatedate() != null ) {
            parJzszpsjgDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            parJzszpsjgDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            parJzszpsjgDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            parJzszpsjgDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getParjzszpsjgid() != null ) {
            parJzszpsjgDTO.setParjzszpsjgid( entity.getParjzszpsjgid() );
        }
        if ( entity.getPimpersonname() != null ) {
            parJzszpsjgDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getZjhm() != null ) {
            parJzszpsjgDTO.setZjhm( entity.getZjhm() );
        }

        return parJzszpsjgDTO;
    }

    @Override
    public List<ParJzszpsjg> toDomain(List<ParJzszpsjgDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParJzszpsjg> list = new ArrayList<ParJzszpsjg>( dtoList.size() );
        for ( ParJzszpsjgDTO parJzszpsjgDTO : dtoList ) {
            list.add( toDomain( parJzszpsjgDTO ) );
        }

        return list;
    }

    @Override
    public List<ParJzszpsjgDTO> toDto(List<ParJzszpsjg> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParJzszpsjgDTO> list = new ArrayList<ParJzszpsjgDTO>( entityList.size() );
        for ( ParJzszpsjg parJzszpsjg : entityList ) {
            list.add( toDto( parJzszpsjg ) );
        }

        return list;
    }
}
