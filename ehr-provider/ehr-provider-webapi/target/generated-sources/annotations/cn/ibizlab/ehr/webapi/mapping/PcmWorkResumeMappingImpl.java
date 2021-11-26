package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmWorkResume;
import cn.ibizlab.ehr.webapi.dto.PcmWorkResumeDTO;
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
    date = "2021-09-04T00:31:48+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmWorkResumeMappingImpl implements PcmWorkResumeMapping {

    @Override
    public PcmWorkResume toDomain(PcmWorkResumeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmWorkResume pcmWorkResume = new PcmWorkResume();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmWorkResume.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmWorkResume.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getWorkunit() != null ) {
            pcmWorkResume.setWorkunit( dto.getWorkunit() );
        }
        if ( dto.getServeendtime() != null ) {
            pcmWorkResume.setServeendtime( dto.getServeendtime() );
        }
        if ( dto.getResumecontent() != null ) {
            pcmWorkResume.setResumecontent( dto.getResumecontent() );
        }
        if ( dto.getZw() != null ) {
            pcmWorkResume.setZw( dto.getZw() );
        }
        if ( dto.getGw() != null ) {
            pcmWorkResume.setGw( dto.getGw() );
        }
        if ( dto.getBm() != null ) {
            pcmWorkResume.setBm( dto.getBm() );
        }
        if ( dto.getPcmworkresumename() != null ) {
            pcmWorkResume.setPcmworkresumename( dto.getPcmworkresumename() );
        }
        if ( dto.getServebegintime() != null ) {
            pcmWorkResume.setServebegintime( dto.getServebegintime() );
        }
        if ( dto.getPcmprofileid() != null ) {
            pcmWorkResume.setPcmprofileid( dto.getPcmprofileid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmWorkResume.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmWorkResume.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmWorkResume.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getPcmworkresumeid() != null ) {
            pcmWorkResume.setPcmworkresumeid( dto.getPcmworkresumeid() );
        }
        if ( dto.getCreateman() != null ) {
            pcmWorkResume.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPcmprofilename() != null ) {
            pcmWorkResume.setPcmprofilename( dto.getPcmprofilename() );
        }
        if ( dto.getCertificatenumber() != null ) {
            pcmWorkResume.setCertificatenumber( dto.getCertificatenumber() );
        }

        return pcmWorkResume;
    }

    @Override
    public PcmWorkResumeDTO toDto(PcmWorkResume entity) {
        if ( entity == null ) {
            return null;
        }

        PcmWorkResumeDTO pcmWorkResumeDTO = new PcmWorkResumeDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmWorkResumeDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmWorkResumeDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getWorkunit() != null ) {
            pcmWorkResumeDTO.setWorkunit( entity.getWorkunit() );
        }
        if ( entity.getServeendtime() != null ) {
            pcmWorkResumeDTO.setServeendtime( entity.getServeendtime() );
        }
        if ( entity.getResumecontent() != null ) {
            pcmWorkResumeDTO.setResumecontent( entity.getResumecontent() );
        }
        if ( entity.getZw() != null ) {
            pcmWorkResumeDTO.setZw( entity.getZw() );
        }
        if ( entity.getGw() != null ) {
            pcmWorkResumeDTO.setGw( entity.getGw() );
        }
        if ( entity.getBm() != null ) {
            pcmWorkResumeDTO.setBm( entity.getBm() );
        }
        if ( entity.getPcmworkresumename() != null ) {
            pcmWorkResumeDTO.setPcmworkresumename( entity.getPcmworkresumename() );
        }
        if ( entity.getServebegintime() != null ) {
            pcmWorkResumeDTO.setServebegintime( entity.getServebegintime() );
        }
        if ( entity.getPcmprofileid() != null ) {
            pcmWorkResumeDTO.setPcmprofileid( entity.getPcmprofileid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmWorkResumeDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmWorkResumeDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmWorkResumeDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getPcmworkresumeid() != null ) {
            pcmWorkResumeDTO.setPcmworkresumeid( entity.getPcmworkresumeid() );
        }
        if ( entity.getCreateman() != null ) {
            pcmWorkResumeDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPcmprofilename() != null ) {
            pcmWorkResumeDTO.setPcmprofilename( entity.getPcmprofilename() );
        }
        if ( entity.getCertificatenumber() != null ) {
            pcmWorkResumeDTO.setCertificatenumber( entity.getCertificatenumber() );
        }

        return pcmWorkResumeDTO;
    }

    @Override
    public List<PcmWorkResume> toDomain(List<PcmWorkResumeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmWorkResume> list = new ArrayList<PcmWorkResume>( dtoList.size() );
        for ( PcmWorkResumeDTO pcmWorkResumeDTO : dtoList ) {
            list.add( toDomain( pcmWorkResumeDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmWorkResumeDTO> toDto(List<PcmWorkResume> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmWorkResumeDTO> list = new ArrayList<PcmWorkResumeDTO>( entityList.size() );
        for ( PcmWorkResume pcmWorkResume : entityList ) {
            list.add( toDto( pcmWorkResume ) );
        }

        return list;
    }
}
