package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParYdgzjh;
import cn.ibizlab.ehr.webapi.dto.ParYdgzjhDTO;
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
    date = "2021-09-04T00:31:52+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParYdgzjhMappingImpl implements ParYdgzjhMapping {

    @Override
    public ParYdgzjh toDomain(ParYdgzjhDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParYdgzjh parYdgzjh = new ParYdgzjh();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parYdgzjh.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parYdgzjh.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getNd() != null ) {
            parYdgzjh.setNd( dto.getNd() );
        }
        if ( dto.getYd() != null ) {
            parYdgzjh.setYd( dto.getYd() );
        }
        if ( dto.getParydgzjhname() != null ) {
            parYdgzjh.setParydgzjhname( dto.getParydgzjhname() );
        }
        if ( dto.getRq() != null ) {
            parYdgzjh.setRq( dto.getRq() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            parYdgzjh.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getCreateman() != null ) {
            parYdgzjh.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            parYdgzjh.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            parYdgzjh.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            parYdgzjh.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getParydgzjhid() != null ) {
            parYdgzjh.setParydgzjhid( dto.getParydgzjhid() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            parYdgzjh.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }

        return parYdgzjh;
    }

    @Override
    public ParYdgzjhDTO toDto(ParYdgzjh entity) {
        if ( entity == null ) {
            return null;
        }

        ParYdgzjhDTO parYdgzjhDTO = new ParYdgzjhDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parYdgzjhDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parYdgzjhDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getNd() != null ) {
            parYdgzjhDTO.setNd( entity.getNd() );
        }
        if ( entity.getYd() != null ) {
            parYdgzjhDTO.setYd( entity.getYd() );
        }
        if ( entity.getParydgzjhname() != null ) {
            parYdgzjhDTO.setParydgzjhname( entity.getParydgzjhname() );
        }
        if ( entity.getRq() != null ) {
            parYdgzjhDTO.setRq( entity.getRq() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            parYdgzjhDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getCreateman() != null ) {
            parYdgzjhDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            parYdgzjhDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            parYdgzjhDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            parYdgzjhDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getParydgzjhid() != null ) {
            parYdgzjhDTO.setParydgzjhid( entity.getParydgzjhid() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            parYdgzjhDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }

        return parYdgzjhDTO;
    }

    @Override
    public List<ParYdgzjh> toDomain(List<ParYdgzjhDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParYdgzjh> list = new ArrayList<ParYdgzjh>( dtoList.size() );
        for ( ParYdgzjhDTO parYdgzjhDTO : dtoList ) {
            list.add( toDomain( parYdgzjhDTO ) );
        }

        return list;
    }

    @Override
    public List<ParYdgzjhDTO> toDto(List<ParYdgzjh> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParYdgzjhDTO> list = new ArrayList<ParYdgzjhDTO>( entityList.size() );
        for ( ParYdgzjh parYdgzjh : entityList ) {
            list.add( toDto( parYdgzjh ) );
        }

        return list;
    }
}
