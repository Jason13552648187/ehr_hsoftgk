package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmProfileSpyy;
import cn.ibizlab.ehr.webapi.dto.PcmProfileSpyyDTO;
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
public class PcmProfileSpyyMappingImpl implements PcmProfileSpyyMapping {

    @Override
    public PcmProfileSpyy toDomain(PcmProfileSpyyDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmProfileSpyy pcmProfileSpyy = new PcmProfileSpyy();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmProfileSpyy.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmProfileSpyy.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getYybm() != null ) {
            pcmProfileSpyy.setYybm( dto.getYybm() );
        }
        if ( dto.getPcmprofilespyyname() != null ) {
            pcmProfileSpyy.setPcmprofilespyyname( dto.getPcmprofilespyyname() );
        }
        if ( dto.getYymc() != null ) {
            pcmProfileSpyy.setYymc( dto.getYymc() );
        }
        if ( dto.getCreateman() != null ) {
            pcmProfileSpyy.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmProfileSpyy.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPcmprofilespyyid() != null ) {
            pcmProfileSpyy.setPcmprofilespyyid( dto.getPcmprofilespyyid() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmProfileSpyy.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmProfileSpyy.setUpdateman( dto.getUpdateman() );
        }

        return pcmProfileSpyy;
    }

    @Override
    public PcmProfileSpyyDTO toDto(PcmProfileSpyy entity) {
        if ( entity == null ) {
            return null;
        }

        PcmProfileSpyyDTO pcmProfileSpyyDTO = new PcmProfileSpyyDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmProfileSpyyDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmProfileSpyyDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getYybm() != null ) {
            pcmProfileSpyyDTO.setYybm( entity.getYybm() );
        }
        if ( entity.getPcmprofilespyyname() != null ) {
            pcmProfileSpyyDTO.setPcmprofilespyyname( entity.getPcmprofilespyyname() );
        }
        if ( entity.getYymc() != null ) {
            pcmProfileSpyyDTO.setYymc( entity.getYymc() );
        }
        if ( entity.getCreateman() != null ) {
            pcmProfileSpyyDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmProfileSpyyDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPcmprofilespyyid() != null ) {
            pcmProfileSpyyDTO.setPcmprofilespyyid( entity.getPcmprofilespyyid() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmProfileSpyyDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmProfileSpyyDTO.setUpdateman( entity.getUpdateman() );
        }

        return pcmProfileSpyyDTO;
    }

    @Override
    public List<PcmProfileSpyy> toDomain(List<PcmProfileSpyyDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmProfileSpyy> list = new ArrayList<PcmProfileSpyy>( dtoList.size() );
        for ( PcmProfileSpyyDTO pcmProfileSpyyDTO : dtoList ) {
            list.add( toDomain( pcmProfileSpyyDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmProfileSpyyDTO> toDto(List<PcmProfileSpyy> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmProfileSpyyDTO> list = new ArrayList<PcmProfileSpyyDTO>( entityList.size() );
        for ( PcmProfileSpyy pcmProfileSpyy : entityList ) {
            list.add( toDto( pcmProfileSpyy ) );
        }

        return list;
    }
}
