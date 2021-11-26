package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmSyqgz;
import cn.ibizlab.ehr.webapi.dto.PcmSyqgzDTO;
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
public class PcmSyqgzMappingImpl implements PcmSyqgzMapping {

    @Override
    public PcmSyqgz toDomain(PcmSyqgzDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmSyqgz pcmSyqgz = new PcmSyqgz();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmSyqgz.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmSyqgz.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getXh() != null ) {
            pcmSyqgz.setXh( dto.getXh() );
        }
        if ( dto.getMinperiod() != null ) {
            pcmSyqgz.setMinperiod( dto.getMinperiod() );
        }
        if ( dto.getLdhtqxjs() != null ) {
            pcmSyqgz.setLdhtqxjs( dto.getLdhtqxjs() );
        }
        if ( dto.getLdhtqx() != null ) {
            pcmSyqgz.setLdhtqx( dto.getLdhtqx() );
        }
        if ( dto.getDuration() != null ) {
            pcmSyqgz.setDuration( dto.getDuration() );
        }
        if ( dto.getSyqjs() != null ) {
            pcmSyqgz.setSyqjs( dto.getSyqjs() );
        }
        if ( dto.getPcmsyqgzname() != null ) {
            pcmSyqgz.setPcmsyqgzname( dto.getPcmsyqgzname() );
        }
        if ( dto.getMaxperiod() != null ) {
            pcmSyqgz.setMaxperiod( dto.getMaxperiod() );
        }
        if ( dto.getOrmorgid() != null ) {
            pcmSyqgz.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmSyqgz.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmSyqgz.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmSyqgz.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getPcmsyqgzid() != null ) {
            pcmSyqgz.setPcmsyqgzid( dto.getPcmsyqgzid() );
        }
        if ( dto.getCreateman() != null ) {
            pcmSyqgz.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrmorgname() != null ) {
            pcmSyqgz.setOrmorgname( dto.getOrmorgname() );
        }

        return pcmSyqgz;
    }

    @Override
    public PcmSyqgzDTO toDto(PcmSyqgz entity) {
        if ( entity == null ) {
            return null;
        }

        PcmSyqgzDTO pcmSyqgzDTO = new PcmSyqgzDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmSyqgzDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmSyqgzDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getXh() != null ) {
            pcmSyqgzDTO.setXh( entity.getXh() );
        }
        if ( entity.getMinperiod() != null ) {
            pcmSyqgzDTO.setMinperiod( entity.getMinperiod() );
        }
        if ( entity.getLdhtqxjs() != null ) {
            pcmSyqgzDTO.setLdhtqxjs( entity.getLdhtqxjs() );
        }
        if ( entity.getLdhtqx() != null ) {
            pcmSyqgzDTO.setLdhtqx( entity.getLdhtqx() );
        }
        if ( entity.getDuration() != null ) {
            pcmSyqgzDTO.setDuration( entity.getDuration() );
        }
        if ( entity.getSyqjs() != null ) {
            pcmSyqgzDTO.setSyqjs( entity.getSyqjs() );
        }
        if ( entity.getPcmsyqgzname() != null ) {
            pcmSyqgzDTO.setPcmsyqgzname( entity.getPcmsyqgzname() );
        }
        if ( entity.getMaxperiod() != null ) {
            pcmSyqgzDTO.setMaxperiod( entity.getMaxperiod() );
        }
        if ( entity.getOrmorgid() != null ) {
            pcmSyqgzDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmSyqgzDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmSyqgzDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmSyqgzDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getPcmsyqgzid() != null ) {
            pcmSyqgzDTO.setPcmsyqgzid( entity.getPcmsyqgzid() );
        }
        if ( entity.getCreateman() != null ) {
            pcmSyqgzDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrmorgname() != null ) {
            pcmSyqgzDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return pcmSyqgzDTO;
    }

    @Override
    public List<PcmSyqgz> toDomain(List<PcmSyqgzDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmSyqgz> list = new ArrayList<PcmSyqgz>( dtoList.size() );
        for ( PcmSyqgzDTO pcmSyqgzDTO : dtoList ) {
            list.add( toDomain( pcmSyqgzDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmSyqgzDTO> toDto(List<PcmSyqgz> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmSyqgzDTO> list = new ArrayList<PcmSyqgzDTO>( entityList.size() );
        for ( PcmSyqgz pcmSyqgz : entityList ) {
            list.add( toDto( pcmSyqgz ) );
        }

        return list;
    }
}
